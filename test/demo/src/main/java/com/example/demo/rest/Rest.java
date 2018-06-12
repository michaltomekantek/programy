package com.example.demo.rest;

import com.example.demo.threads.MyThread;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.task.TaskExecutor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rest {

<<<<<<< HEAD
	@Override
	public String toString() {
		return "Rest [test()=" + test() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	@RequestMapping(value = "path", method = RequestMethod.GET)
	public String test() {
		
		return p;
	}
	
	
=======
    public static String p = "";

    @Autowired
    private TaskExecutor taskExecutor;
    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping(value = "path", method = RequestMethod.GET)
    public String test() {
        MyThread myThread = applicationContext.getBean(MyThread.class);
        taskExecutor.execute(myThread);
        return "ok";
    }
>>>>>>> 6ebe9eff09210894535d0fb12811c789204bd5ae

}
