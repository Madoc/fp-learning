# lolhttp trivial HTTP server plan

Create a simple HTTP server, in the following steps:
* It returns a random number on `GET /random`. (That is, a new one each time.)
* A simple accumulator:
  * `GET /accumulator` returns the current number.
  * `POST /accumulator` with a number in the body adds that number to the current accumulator number.
  * `PUT /accumulator` overwrites the current accumulator number entirely.
  * `DELETE /accumulator` resets the current accumulator number to zero.
* Combining HTTP and file I/O:
  * `GET /storage/<filename>` reads a text file from a special folder and responds with the contents. (No relative paths allowed.)
  * `PUT /storage/<filename>` creates or overwrites a certain file. (Again, no relative paths.)
  * `DELETE /storage/<filename>` deletes a certain file.
* Logging: Integrate logging. This can also be done any other time.
