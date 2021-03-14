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


//DoubleQueue enqueues the element after doubling them
class DoubleQueue extends Queue
{
  def enqueue(queue: List[Int] , element : Int): List[Int] =
    {
      ( element * 2 )  :: queue
    }

  override def dequeue(queue: List[Int]): Any = super.dequeue(queue)
}



//SquareQueue enqueues the element after squaring them
class SquareQueue extends Queue
{

  //add element to the queue
  def enqueue(queue: List[Int], element: Int): List[Int] = {
    {
      (element * element) :: queue
    }
  }

  //delete element from the queue
  override def dequeue(queue: List[Int]): Any = super.dequeue(queue)

}
