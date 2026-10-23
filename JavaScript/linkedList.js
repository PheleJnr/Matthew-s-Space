//when creating a node, you must pass a value
class Node{
    constructor(data){
        this.data = data;
        this.next = null;

    }
}

class LinkedList{
    constructor(data) {
        this.head = null;
        this.size = 0;

    }

    append(data){
        let newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;

        }else{
            let current = this.head;
                while (current.next != null){
                    current = current.next;
                }
                current.next = newNode;

        }
        this.size++;
    }

    prepend(data){
        let newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;

        }else{
            let temp = this.head;
            this.head = newNode;
            newNode = temp;
        }
        this.size++;
    }

    insertAt(data, position){
        let newNode = new Node(data);
        if(position < 0 || position > this.size){
            return;

        }
        let current = this.head;
        let counter = 0;
            while(current.next != null){
                current = current.next;
                counter++;
                if(counter == position) {
                    let temp = current.next;
                    current.next = newNode;
                    newNode.next = temp;
                    this.size++;
                    break;
                }
            }
    }

    removeAt(data, position){
        let newNode = new Node(data);
        if(position == 0){
            this.head = this.head.next;
        }else{
            let current = this.head;
            for(let count = 0; count < position-1; count++) {
                 current = current.next;
            }
            current.next = current.next.next;
        }
        this.size--;


    }
}

    // prepend(data){}
    // insertAt(data, index){}
    // removeAt(data, index){}


module.exports = {LinkedList};