package com.josephio.springchronicledisruptor.queue.chronicle;

import com.josephio.springchronicledisruptor.queue.queue;
import net.openhft.chronicle.queue.impl.single.SingleChronicleQueue;
import net.openhft.chronicle.queue.impl.single.SingleChronicleQueueBuilder;

public class endpoint implements queue {


    @Override
    public void create(String path) {
        SingleChronicleQueue singleChronicleQueue = SingleChronicleQueueBuilder.binary(path).build();

    }

    @Override
    public void exists(String path) {

    }


    @Override
    public void countMessages(String queue) {

    }

    @Override
    public void send(String queue) {

    }

    @Override
    public void readAll(String queue) {

    }

    @Override
    public void read(String queue) {

    }

    @Override
    public void deleteAll(String queue) {

    }

    @Override
    public void delete(long index) {

    }
}
