class Publisher : IObservable {
    override val observers: ArrayList<IObserver> = ArrayList()

    var id = ""
        set(value) {
            field = value
            sendUpdateMessage()
        }

    override fun add(observer: IObserver) {
        observers.add(observer)
    }

    override fun remove(observer: IObserver) {
        observers.remove(observer)
    }

    override fun sendUpdateMessage() {
        observers.forEach {
            it.update()
        }
    }
}