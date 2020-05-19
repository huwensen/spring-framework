package com.pa;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;

@Configurable
@ComponentScan("com.pa")
public class Config {

	public static void main(String[] args) {
		File file = new File("");
		file.listFiles();
	}
}
