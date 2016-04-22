import akka.actor.{ Actor, ActorSystem, Props }
import akka.actor.ActorDSL._
import akka.actor.ActorSystem
import akka.testkit.CallingThreadDispatcher

val system = ActorSystem()

class EchoServer extends Actor {
	def receive = {
		case msg: String => println("echo " + msg)
		case number: Int => println("echo " + number)
		case _ => println("echo")
	}
}

/*
val echoServer = system.actorOf(Props[EchoServer])
echoServer ! "hi"
echoServer ! 5
system.shutdown
*/
/*
implicit val system = ActorSystem()
val echoServer2 = actor(new Act {become {case msg => println("echo " + msg)}})
echoServer2 ! "hi"
echoServer2 ! 5
system.shutdown
*/
val echoServers = (1 to 10).map(x => 
	system.actorOf(Props(new EchoServer(x.toString))
		.withDispatcher(CallingThreadDispatcher.Id)))
(1 to 10).foreach(msg => echoServers(scala.util.Random.nextInt(10)) ! msg)
system.shutdown

