# scala

I'm learning scala.

### Resources: 
```
http://zh.scala-tour.com/ 
http://docs.scala-lang.org/cheatsheets/
http://www.scala-lang.org/api/current/index.html
http://docs.scala-lang.org/tutorials/tour/tour-of-scala.html
http://hongjiang.info/scala/
```

### Books:
```
《Atomic Scala》 2nd Edition
《Programming in Scala》 2nd Edition
```

### Text editor: 
*sublime text 3*

click Tools->Build System->New Build System, add these line
```
{
	    "cmd": ["[PATH for Scala]", "[Parameters for Scala]", "$file"],
		    "working_dir": "${project_path:${folder}}",
			    "selector": "source.scala"
}
```
and save as `Scala.sublime-build`.

Then you can run the scala scripts through `ctrl-b`

### Environment:
add `atomic-scala-examples` and `atomic-scala-examples/commons-math3-3.6.1.jar` to `$CLASSPATH`

