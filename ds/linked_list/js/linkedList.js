/**
 * LinkedList class has following methods avialable
 * - append()
 * - prepend()
 * - removeFirst()
 * - removelast()
 * - removeByData()
 * - indexOf()
 * - print()
 */


class Node{
  constructor(data){
    this.data = data;
    this.next = null;
  }
}

class LinkedList{
  
  constructor(){
    this.head = null;
    this.tail = null;
    this.size = 0;
  }
  // Add Element at the end of the LinkedList
  append(data) {
    // Create a Node
    let node = new Node(data);
    // Check If LinkedList has NO elements 
    if(this.head === null){
      this.head = node;
      this.tail = node;
    }else{
      this.tail.next = node;
      this.tail = this.tail.next;
    }
    this.size++;
    // console.log(this.head, '+++++++++++++++')
  }
  // print contents of an LinkedList
  print(){
    let arr = [];
    let current = this.head;
    while(current !== null){
      arr.push(current);
      current = current.next;
    }
    console.log(arr);
    return arr;
    // console.log(this.tail, '<TAIL>')
   
  }
  sizeofList(){
    return this.size;
  }
  // Add Element at the start of the LinkedList
  prepend(data){
    // create a node
    let node = new Node(data);
    if(this.head === null){
      this.head = node;
      this.tail = node;
    }else{
      // Make new Node as Head Node
      let nodeAfterHead = this.head;
      this.head = node;
      this.head.next = nodeAfterHead; 
    }
    this.size++;
 
  }
  //Remove element from the beginning of the LiskedList
  removeFirst(){

    if(this.head === this.tail){
      this.head = this.tail = null;
    }else{
      let newHead = this.head.next;
      this.head.next = null;
      this.head = newHead;
    }
    this.size--;
  }
  // Remove element from the end of the LinkedList
  removeLast(){
    let current = this.head;
    while(current !== null){
      if(this.tail === current.next){
        this.tail = current;
        this.tail.next = null;
      }
      current = current.next;
    }
    this.size--;

  }
  insertAt(data, position){
    if(this.head !== null){
      if(position < 0 || position > this.size){
        throw Error('Wrong Position')
      }else{
        let node = new Node(data); 
        let current = this.head;
        let prev;

        if(position === 0){
          node.next = this.head;
          this.head = node;
        }else{
           for (let index = 0; index < position ; index++) {
             prev = current;
             current = current.next;
           }
          //  console.log(current, position)
           node.next = current;
           prev.next = node;
           
        }
      }
     
   
    }
  }
  // Retrun Index of element
  indexOf(data){
    let current = this.head;
    let index = 0;
    while(current !== null){
      if(current.data === data){
        console.log(index);
      }
      index++;
      current = current.next;
    }
  }
  // reverse a LinkedList
  reverseIterative(){
    // 1 -----------> 2 -------> 3 -------->  4
    //  prevNode  currentNode  nextNode  
    let prevNode = this.head;
    let current = this.head.next;
    
    while(current !== null){
      let nextNode = current.next;
      current.next = prevNode;
      prevNode = current;
      current = nextNode;
    }
    this.tail = this.head;
    this.tail.next = null;
    this.head = prevNode;
  }
  lenCheck(){
    let len = 0;
    let current = this.head;
    while(current !== null){
      current = current.next;
      len++;
    }
    console.log(len)
    return len;
  }
}

let list = new LinkedList();
list.append(10);
list.append(20);
list.append(30);
// list.append(40);
// list.prepend(5);
// list.removeFirst();
// list.removeLast();
// list.indexOf(5);
// list.insertAt(90, 1);
// list.reverseIterative();
list.print();
list.lenCheck()
// console.log(list.sizeofList());
