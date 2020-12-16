package com.gdpph.o1kuaixue.demo.chapter15.section3.section4;

import java.lang.IllegalArgumentException;
import java.io.File;
/** IllegalArgumentException异常
 * @author 零壹学堂
 */
public class Demo {
    public static String createFilePath(String parent, String filename) throws IllegalArgumentException{
        if(parent == null)
			throw new IllegalArgumentException("文件路径不能为空！");

		if(filename == null)
			throw new IllegalArgumentException("文件名称不能为空！");

		return parent + File.separator + filename;
	}
	public static void main(String[] args) {
		System.out.println(Demo.createFilePath("dir1", "file1"));
		System.out.println();
		System.out.println(Demo.createFilePath(null, "file1"));
	}
}
