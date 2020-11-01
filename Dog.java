package com.training.javaapp;

public class Dog {
	private String breed;
	private int size;
	private String color;

	public Dog(String breed, int size, String color) {
		this.breed = breed;
		this.size = size;
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"breed='" + breed + '\'' +
				", size=" + size +
				", color='" + color + '\'' +
				'}';
	}
}
