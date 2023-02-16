package com.malik.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.malik.controller.DirUtilsController;

public class DirUtils {
	private static final Logger log = LoggerFactory.getLogger(DirUtils.class);

	/**
	 * Get all dirs and files
	 */
	public void getAll() {
		String dirName = "C:/temp/projects";
        File file = new File(dirName);

        try {
			Files.walkFileTree(file.toPath(), new SimpleFileVisitor<Path>() {
			    @Override
			    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
			        log.info(file.toString());
			        System.out.println(file);
			        return FileVisitResult.CONTINUE;
			    }
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
