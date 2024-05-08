package com.example.hopedemo.aglo.linkedlist_07

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
}

class Node constructor(var data:Int, var next:Node?){

}