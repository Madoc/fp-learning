# Trivial HTTP server plan

## Framework candidates

* [lolhttp](https://github.com/criteo/lolhttp): Looks quite easy to handle. Uses Cats.
* [Spray](http://spray.io/): Works on top of Akka.
* [http4s](https://http4s.org/): Also based on Cats, among other libraries.

## Plan per framework

Create a simple HTTP server, in the following steps:
1. It returns `Hello, world!` on `GET /hello`.
2. It returns a random number on `GET /random`. (That is, a new one each time.)
3. A simple accumulator:
   * `GET /accumulator` returns the current number.
   * `POST /accumulator` with a number in the body adds that number to the current accumulator number.
   * `PUT /accumulator` overwrites the current accumulator number entirely.
   * `DELETE /accumulator` resets the current accumulator number to zero.
4. Combining HTTP and file I/O:
   * `GET /storage/<filename>` reads a text file from a special folder and responds with the contents. (No relative paths allowed.)
   * `PUT /storage/<filename>` creates or overwrites a certain file. (Again, no relative paths.)
   * `DELETE /storage/<filename>` deletes a certain file.
5. Logging: Integrate logging. This can also be done any other time.
