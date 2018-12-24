package com.flowable.demo.task;
import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;
 
public class ManagerTaskHandler implements TaskListener {
 
	private static final long serialVersionUID = 1L;

	@Override
    public void notify(DelegateTask delegateTask) {
        delegateTask.setAssignee("经理");
    }
 
}
