package com.example.mytask;

public class Schedule {


    private static class University {
        private String name;
        private String location;
        private int age;
        private String phone;


        public University(String name, String location, String phone, int age) {
            this.name = name;
            this.location = location;
            this.phone = phone;
            this.age = age;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public void setAge(int age) {
            this.age = age;
        }


        private class ScheduleDay {
            University mondey = new University("Jhon","big hall","Nokia",32);
            ArrayList<String> subject = new ArrayList<String>();
            subjectsList.add(subject);


        }

        private class Subject {
            public String getName() {
                return name;
            }

        }

        public class Classroom {

            public String getName() {
                return  name;
            }

            public String getLocation() {
                return location;
            }
        }

        public class Teacher {
            public String getName() {
                return name;
            }

            public String getPhone() {
                return phone;
            }

            public int getAge() {
                return age;
            }
        }
    }

}

