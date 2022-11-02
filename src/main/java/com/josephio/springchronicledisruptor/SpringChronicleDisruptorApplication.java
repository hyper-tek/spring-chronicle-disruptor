package com.josephio.springchronicledisruptor;

import net.openhft.chronicle.queue.ExcerptAppender;
import net.openhft.chronicle.queue.impl.single.SingleChronicleQueue;
import net.openhft.chronicle.queue.impl.single.SingleChronicleQueueBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class SpringChronicleDisruptorApplication {
	private static final Path MAVEN_TARGET_DIR = Path.of("target");
	private static final String CHRONICLE_FOLDER = "\\chronicle-queue";

	public static void main(String[] args) throws IOException {
		SpringApplication.run(SpringChronicleDisruptorApplication.class, args);
		String sChronicleTargetDir = MAVEN_TARGET_DIR.toAbsolutePath().toString().concat(CHRONICLE_FOLDER);
		System.out.println(sChronicleTargetDir);
		Path chronicleTargetDir = Paths.get(sChronicleTargetDir);
		System.out.println(Files.createDirectories(chronicleTargetDir));
		File queueDir = chronicleTargetDir.toFile();
		SingleChronicleQueue queue = SingleChronicleQueueBuilder.single(sChronicleTargetDir).build();
		System.out.println("Entry count = " + queue.entryCount());
		System.out.println("Index count = " + queue.indexCount());
		ExcerptAppender appender = queue.acquireAppender();
		appender.writeText("001");
		appender.writeText("002");
		appender.writeText("003");
	}

}
