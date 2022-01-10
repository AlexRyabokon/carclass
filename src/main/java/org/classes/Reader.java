package org.classes;

public class Reader {
    private String lastName;
    private String name;
    private String fathersName;
    private int dateOfBirth;
    private int readerID;
    private String faculty;
    private int phone;
    private int callCounter = 0;




    public Reader(String lastName, String name, String fathersName, int dateOfBirth, int readerID, String faculty, int phone) {
        this.lastName = lastName;
        this.name = name;
        this.fathersName = fathersName;
        this.dateOfBirth = dateOfBirth;
        this.readerID = readerID;
        this.faculty = faculty;
        this.phone = phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getReaderID() {
        return readerID;
    }

    public void setReaderID(int readerID) {
        this.readerID = readerID;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    private void countCall() {
        callCounter++;
        System.out.println(callCounter);
        }

    void takeBook() {

        }

    void takeBook(int howManyBooks) {
            countCall();
            System.out.println("Vzyato knig: " + howManyBooks);
        }





}
