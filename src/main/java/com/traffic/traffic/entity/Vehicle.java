package com.traffic.traffic.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="traffic")
public class Vehicle {

		@Id
		@Column(name="lno")
		private int lno;
		@Column(name="time")
		private String time;
		@Column(name="vtr1")
		private  int vtr1;
		@Column(name="vtr2")
		private  int vtr2;
		@Column(name="vtr3")
		private  int vtr3;
		@Column(name="vtr4")
		private  int vtr4;
		@Column(name="vtr5")
		private  int vtr5;
		@Column(name="totalvehicle")
		private int totalvehicle;

//constructors		
		
		public Vehicle() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		

		public Vehicle(int lno, String time, int vtr1, int vtr2, int vtr3, int vtr4, int vtr5, int totalvehicle) {
	super();
	this.lno = lno;
	this.time = time;
	this.vtr1 = vtr1;
	this.vtr2 = vtr2;
	this.vtr3 = vtr3;
	this.vtr4 = vtr4;
	this.vtr5 = vtr5;
	this.totalvehicle = totalvehicle;
}


// getters and setters
		
		public int getLno() {
			return lno;
		}

		public void setLno(int lno) {
			this.lno = lno;
		}

	
		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public int getVtr1() {
			return vtr1;
		}

		public void setVtr1(int vtr1) {
			this.vtr1 = vtr1;
		}

		public int getVtr2() {
			return vtr2;
		}

		public void setVtr2(int vtr2) {
			this.vtr2 = vtr2;
		}

		public int getVtr3() {
			return vtr3;
		}

		public void setVtr3(int vtr3) {
			this.vtr3 = vtr3;
		}

		public int getVtr4() {
			return vtr4;
		}

		public void setVtr4(int vtr4) {
			this.vtr4 = vtr4;
		}

		public int getVtr5() {
			return vtr5;
		}

		public void setVtr5(int vtr5) {
			this.vtr5 = vtr5;
		}

		public int getTotalvehicle() {
			return totalvehicle;
		}

		public void setTotalvehicle(int totalvehicle) {
			this.totalvehicle = totalvehicle;
		}

}
