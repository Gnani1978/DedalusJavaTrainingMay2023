package com.training.Signal;

public class TrafficSingnalInBehaviourPattern {
	 
	    private InterfaceSignal SignalChange; 

	    public TrafficSingnalInBehaviourPattern() {
	    	SignalChange = new RedState();
	    }

	    public void changeState() {
	    	SignalChange.changeState(this);
	    }

	    public void setCurrentState(InterfaceSignal state) {
	    	SignalChange = state;
	    }

	    public void displaySignal() {
	    	SignalChange.displaySignal();
	    }

	    public static void main(String[] args) {
	    	TrafficSingnalInBehaviourPattern TS = new TrafficSingnalInBehaviourPattern();

	        for (int i = 0; i < 6; i++) {
	            TS.displaySignal();
	            TS.changeState();

	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

