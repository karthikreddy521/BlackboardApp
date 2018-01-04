package com.school.blackboard.model;

public class Course {

		private int courseId;
		private String courseName;
		private String courseDescription;
		private int year;
		private int semId;
		
		public Course() {
			
		}
		
		public Course(int courseId, String courseName, String courseDescription, int year, int semId) {
			super();
			this.courseId = courseId;
			this.courseName = courseName;
			this.courseDescription = courseDescription;
			this.year = year;
			this.semId = semId;
		}
		
		public int getCourseId() {
			return courseId;
		}

		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public String getCourseDescription() {
			return courseDescription;
		}

		public void setCourseDescription(String courseDescription) {
			this.courseDescription = courseDescription;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public int getSemId() {
			return semId;
		}

		public void setSemId(int semId) {
			this.semId = semId;
		}

		@Override
		public String toString() {
			return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDescription="
					+ courseDescription + ", year=" + year + ", semId=" + semId + "]";
		}
		
}
