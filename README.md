# play-big-app
Big Play! application (500+ java classes)

Demo application for testing Play! framework performance issues.

## How to run
* `git clone https://github.com/asolntsev/big-app.play.git`
* `cd big-app.play`
* `play run`
* open `http://localhost:9000/` in browser

## How to trigger reloading classes
* Modify file `app/util/Util.java` and replace `Object` with `Integer`
* Refresh `http://localhost:9000/` in browser
  * Expected result: Play detects the change and reloads classes
  * Actual result: 
    * Play throws billion of errors trying to reload classes
    * Old classes still live in memory (Play memory leaks)

## How to reproduce more errors
* Uncomment annotations in file `app/jobs/JobAskingClasses.java`
* `play run`