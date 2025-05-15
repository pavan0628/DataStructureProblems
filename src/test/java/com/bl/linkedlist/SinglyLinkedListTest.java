package com.bl.linkedlist;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

        static SinglyLinkedList list;

        @BeforeAll
        public static void setUp()
        {
            list = new SinglyLinkedList();
            list.addFirst(70);
            list.addFirst(30);
            list.addFirst(56);
            list.addFirst(40);
        }
        @Test
        void searchTest() {
            assertTrue(list.search(30),"30 should found");
        }

        @Test
        void insertAfterKeyTest(){
            assertTrue(list.insertDataAfterGivenKey(40,30),"40 should insert after 30");
        }

        @Test
        void deleteElementTest(){
            assertTrue(list.deleteData(40),"40 should be deleted");
        }

    }