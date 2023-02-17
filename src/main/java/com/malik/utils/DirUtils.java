package com.malik.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DirUtils {
	private static final Logger log = LoggerFactory.getLogger(DirUtils.class);

	/**
	 * Get all dirs and files
	 * @return 
	 */
	public List<String> getAll() {
		String dirName = "C:/temp/projects";
        File file = new File(dirName);
        List<String> df = new ArrayList<>();

        try {
			Files.walkFileTree(file.toPath(), new SimpleFileVisitor<Path>() {
			    @Override
			    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
			        log.info(file.toString());
			        df.add(file.toString() + "<br>");
			        return FileVisitResult.CONTINUE;
			    }
			});
		} catch (IOException e) {
			log.info(e.getMessage());
		}
        return df;
	}

}
