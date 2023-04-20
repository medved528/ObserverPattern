fun main() {
    val publisher = Publisher()
    val John = Subscriber("John")
    val Will = Subscriber("Will")
    val Sam = Subscriber("Sam")

    println("The publisher began to collect subscriptions")
    publisher.add(John)
    publisher.add(Will)
    publisher.add(Sam)

    println("The publishing house began to publish")
    publisher.id = "Pilot release"

    println("Changing subscriptions")
    publisher.remove(Sam)
    val Alex = Subscriber("Alex")
    publisher.add(Alex)

    println("The second edition is out")
    publisher.id = "Second release"
}