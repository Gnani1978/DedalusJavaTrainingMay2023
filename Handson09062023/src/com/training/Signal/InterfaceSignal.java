package com.training.Signal;

interface InterfaceSignal {
	    void changeState(TrafficSingnalInBehaviourPattern TS);

	    void displaySignal();
	}

	class RedState implements InterfaceSignal {
	    public void changeState(TrafficSingnalInBehaviourPattern TS) {
	        TS.setCurrentState(new GreenState());
	    }


	    public void displaySignal() {
	        System.out.println("Alert signal red!!!");
	    }
	}

	class GreenState implements InterfaceSignal {

	    public void changeState(TrafficSingnalInBehaviourPattern TS) {
	        TS.setCurrentState(new YellowState());
	    }


	    public void displaySignal() {
	        System.out.println("Alert signal green!!!");
	    }
	}

	class YellowState implements InterfaceSignal {

	    public void changeState(TrafficSingnalInBehaviourPattern TS) {
	        TS.setCurrentState(new RedState());
	    }


	    public void displaySignal() {
	        System.out.println("Alert signal yellow!!!");
	    }
	}


