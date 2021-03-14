// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class QueueTest extends AnyFlatSpec {

  //scalastyle:off magic.number

  val doubleTheQueue = new DoubleQueue

  "enqueue operation in doubleTheQueue " should "first double the element then add that element to queue " in {
    assert(doubleTheQueue.enqueue(List(1, 2, 3), 4) == List(8, 1, 2, 3))
  }


  //negative test case
  "enqueue operation in doubleTheQueue  " should "correctly double the element then add to queue " in {
    assert(doubleTheQueue.enqueue(List(4, 2, 3), 10) != List(10, 4, 2, 3))
  }

  it should "throw NoSuchElementException when List is empty" in
    assertThrows[NoSuchElementException] {
      doubleTheQueue.dequeue(List())
    }

  "dequeue operation in doubleTheQueue " should "remove the first inserted element from the queue " in {
    assert(doubleTheQueue.dequeue(List(20, 30, 40, 50)) == List(20, 30, 40))
  }

  //negative test case
  "dequeue operation in doubleTheQueue " should "remove the first inserted element from the queue correctly  " in {
    assert(doubleTheQueue.dequeue(List(20, 30, 40, 50)) != List(30, 40, 50))
  }


  val squareTheQueue = new SquareQueue

  "enqueue operation in squareTheQueue " should "first find square of the element then add it to queue " in {
    assert(squareTheQueue.enqueue(List(10, 20, 30), 5) == List(25, 10, 20, 30))
  }

  //negative test case
  "enqueue operation in squareTheQueue " should "correctly find square of the element then add it to queue " in {
    assert(squareTheQueue.enqueue(List(20, 30, 40), 10) != List(25, 20, 30, 40))
  }

  it should "throw NoSuchElementException when List is empty" in
    assertThrows[NoSuchElementException] {
      squareTheQueue.dequeue(List())
    }


  "dequeue operation in squareTheQueue " should "remove the first inserted element from the queue " in {
    assert(squareTheQueue.dequeue(List(20, 30, 40, 50)) == List(20, 30, 40))
  }

  //negative test case
  "dequeue operation in squareTheQueue " should "remove the first inserted element from the queue correctly" in {
    assert(squareTheQueue.dequeue(List(20, 30, 40, 50)) != List(20, 30, 50))
  }


}
