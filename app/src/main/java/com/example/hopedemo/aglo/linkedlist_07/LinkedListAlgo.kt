package com.example.hopedemo.aglo.linkedlist_07

import java.lang.RuntimeException

/**
 * description: com.example.hopedemo.aglo.linkedlist_07
 * *
 * author: developer
 * *
 * create: 2024/5/8
 */
class LinkedListAlgo {

    var head:Node? = null

    fun reverse(list:Node?):Node?{

        var pre :Node? = null
        var current: Node? = list
        while(current != null){
            var temp = current.next

            current.next = pre
            pre = current
            current = temp
        }

//        current?.next = pre;
        head = pre
        return pre
    }

    fun insertToHead(value:Int):Node{
        var newNode = Node(value, null)
        newNode.next = head
        head = newNode

        return newNode
    }

    fun printAll(list: Node?) {
        var temp = list
        while (temp != null){
            print("${temp.data}, ")
            temp = temp.next
        }
        println()
    }

    ///链表中环的检测：快慢指针法：这种方法使用两个指针，一个快指针（每次移动两个节点）和一个慢指针（每次移动一个节点）。
    // 如果链表中存在环，快指针和慢指针最终会相遇。如果它们相遇，说明链表中存在环。
    fun checkCircle(list:Node?):Boolean{
        if(list == null)
            return false
        var slow = list
        var fast = list
        while (fast?.next != null){
            slow = slow?.next
            fast = fast?.next?.next

            if(fast === slow){
                return true
            }
        }
        return false
    }

    fun transformListToCircle():Boolean{
        if(headIsEmptyOrOneElement())
            return false;
        var node = head;
        while(node?.next != null){
            node = node.next
        }
        if(node != null){
            node.next = head
            return true
        }
        return false
    }

    private fun headIsEmptyOrOneElement():Boolean{
        if(head == null || head?.next == null)
            return true
        return false
    }

    fun mergeSortedList(listLeft: Node?, listRight:Node?):Node?{
        var left = listLeft
        var right = listRight

        var resultNode:Node? = null
        if((left?.data ?: 0) > (right?.data ?: 0)){
            resultNode = left
            left = left?.next
        }else{
            resultNode = right
            right = right?.next
        }

        var circleNode = resultNode
        while (left != null && right != null){
            if(left.data > right.data){
                circleNode?.next = left
                left = left.next
            } else{
                circleNode?.next = right;
                right = right.next
            }
            circleNode = circleNode?.next
        }
        if(left != null){
            circleNode?.next = left
        }else{
            circleNode?.next = right
        }
        return resultNode
    }

    ///删除链表中倒数第 n 个节点, 使用一个快指针走n个节点，然后再来一个慢指针同时走，当
    ///快指针走到尾部时候，此时慢指针指向的就是 倒数第n个节点的位置
    fun deleteInverseNode(list:Node?, deletePos:Int):Node?{
        if(list == null)
            return list
        var fast = list
        var i = 1////注意是倒数第几个，所以从1开始
        while (list != null && i < deletePos){
            i++
            fast = fast.next
        }

    }
}

class Node constructor(var data:Int, var next:Node?){

}