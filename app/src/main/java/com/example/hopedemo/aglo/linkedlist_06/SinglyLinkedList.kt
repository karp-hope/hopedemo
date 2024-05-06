package com.example.hopedemo.aglo.linkedlist_06

/**
 * description: com.example.hopedemo.aglo.linkedlist_06
 * *
 * author: developer
 * *
 * create: 2024/4/24
 */
class SinglyLinkedList {

    private var head:Node? = null
    class Node (var data:Int, var next:Node?)

    fun findByValue(data: Int):Node?{
        var node = head
        while (node != null && node.data != data){
            node = node.next
        }
        return node
    }

    fun findByIndex(index: Int):Node?{
        var node = head
        var pos = 0
        while (node != null && pos != index){
            node = node.next
            pos++
        }
        return node
    }

    fun insertToHead(value:Int){
        var newHead = Node(value, null)
        insertToHead(newHead)
    }

    private fun insertToHead(newHead:Node){
        newHead.next = head
        head = newHead
    }

    fun insertToTrail(value: Int){
        val newNode = Node(value, null)

        if(head == null){
            head = newNode
        }else{
            var p = head
            while (p?.next != null){
                p = p.next
            }
            p?.next = newNode
        }
    }

    fun insertAfter(p:Node?, value: Int){
        val node = Node(value, null)
        insertAfter(p, node)
    }

    private fun insertAfter(p:Node?, newNode:Node){
        if(p == null)return
        newNode.next = p.next
        p.next = newNode
    }

    fun insertBefore(p:Node?, value: Int){
        val newNode = Node(value, null)

    }

    private fun insertBefore(p:Node?, newNode:Node){
        if(p == null) return
        if(p == head){
           insertToHead(newNode)
            return
        }

        var preNode = head
        while (preNode != null && preNode.next != p){
            preNode = preNode.next
        }
        newNode.next = p
        preNode?.next = newNode
    }

    fun deleteByNode(deleteNode:Node?){
        if(deleteNode == null || head == null)
            return

        if(head == deleteNode){
            head = head?.next
            return
        }

        var p = head
        while (p != null && p.next != deleteNode){
            p = p.next
        }

        if(p == null)
            return

        p.next = deleteNode.next
        deleteNode.next = null
    }

    fun deleteByValue(value: Int){
        if(head == null) return

        var p = head
        var pre = head
        while (p != null && p.data != value){
            pre = p
            p = p.next
        }

        if(p == null){
            return
        }

        pre?.next = p.next
        p.next = null
    }

    fun printAll():Unit{
        var beginNode = head
        while (beginNode != null){
            print("${beginNode.data}")
            beginNode = beginNode.next
        }
    }

    fun TFResult(leftNode: Node?, rightNode: Node?): Boolean {
        var le = leftNode
        var rt = rightNode
        println("left_:${leftNode?.data}")
        println("right_:${rightNode?.data}")
        while (le != null && rt != null){
            if(le.data == rt.data){
                le = le?.next;
                rt = rt?.next;
            }else{
                break;
            }
        }

        return le == null && rt == null
    }

    ///判断是否为回文
    fun palindrome(): Boolean {
        if(head == null){
            return false
        }

        var p = head
        var q = head

        if(p?.next == null){
            println("只有一个元素")
            return true
        }

        ///通过快慢指针找中间节点
        while (q?.next != null && q.next?.next != null){
            p = p?.next
            q = q.next?.next
        }
        println("中间节点${p?.data}")
        var leftLine:Node?
        val rightLine:Node?
        if(q?.next == null){///这个是奇数
            ///此时p肯定为中间节点
            leftLine = p;
            rightLine = p?.next
        }else{

        }
        return true
    }

}