package today.snowstorm.api.events;

import best.azura.eventbus.events.CancellableEvent;

public abstract class Event extends CancellableEvent {
    private EventType type;

    public void setType(EventType type) {
        this.type = type;
    }

    public final EventType getType() {
        return type;
    }
}
