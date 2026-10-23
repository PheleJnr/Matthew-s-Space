const{ LinkedList } = require('./linkedList.js');

    describe('LinkedList', ()  => {

        let list;

        beforeEach(() => {
            list = new LinkedList();

        })

        test('test that the LinkedList is empty', () => {
            expect(list.head).toBeNull();
            expect(list.size).toEqual(0);
        })

        test('that a node can be added to a linkedList', () => {
            //when i add
            list.append(10);
            list.append(20);
            list.append(30);
            //assert that
            expect(list.size).toEqual(3);
            expect(list.head.data).toEqual(10);

        })

        test('that a node can be pre-added to a linkedList', () => {
            //given that i add
            list.append(10);
            list.append(20);
            list.append(30);
            list.append(40);

            //when i check
            list.prepend(60);

            //assert that
            expect(list.size).toEqual(5);
            expect(list.head.data).toEqual(60);

        })

         test('that a node can be inserted to a linkedList', () => {
             //given that i add
             list.prepend(50);
             list.append(10);
             list.append(20);
             list.append(30);
             list.append(40);
             list.append(60);

             //when i check
             list.insertAt(10, 1);

             //assert that
             expect(list.size).toEqual(7);
             expect(list.head.data).toEqual(50);
             console.log(list.head.data);

         })

        test('that a node can be removed from the linkedList', () => {
            list.prepend(50);
            list.append(10);
            list.append(20);
            list.append(30);
            list.append(40);

            list.removeAt(20, 2);
            expect(list.size).toEqual(4);
            expect(list.head.data).toEqual(50);
            console.log(list.head.data);

        })
})

