class Subscriber(val name: String) : IObserver {
    var publisher = Publisher()
    override fun update() {
        println("Subscriber ${this.name} received ${publisher.id}")
    }
}