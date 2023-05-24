package com.training.Salary;

public class Salary {

	private double basic;
	private double da;
	private double pf;
	private double gross;
	private double net;

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = 10000;
	}

	public double getDa() {
		return basic * 0.25;
	}

	public void setDa(double da) {
		this.da = getDa();
	}

	public double getPf() {
		return basic * 0.5;
	}

	public void setPf(double pf) {
		this.pf = getPf();
	}

	public double getGross() {
		return basic + getDa() + getPf();
	}

	public void setGross(double gross) {
		this.gross = getGross();
	}

	@Override
	public String toString() {
		return "Salary [basic=" + basic + ", da=" + da + ", pf=" + pf + ", gross=" + gross + ", net=" + net + "]";
	}

	public double getNet() {
		return basic + getDa();
	}

	public void setNet(double net) {
		this.net = getNet();
	}

	public Salary(double e)
	{
		setBasic(e);
		setDa(e);
		setPf(e);
		setGross(e);
		setNet(e);
	}


}