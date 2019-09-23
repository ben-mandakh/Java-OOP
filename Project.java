class Project{
    private String name;
    private String description;
    public Project(){
        this.name = "Coding Dojo";
        this.description = "Coding intense program - 14 weeks";
    }
    public Project(String nameParam){
        this.name = nameParam;
        this.description = "There is no description";
    }
    public Project(String nameParam, String descParam){
        this.name = nameParam;
        this.description = descParam;
    }
    public void elevatorPitch(Project anotherObject){
        System.out.println("Project name is : " + this.name);
        System.out.println("Project description is : " + this.description);

    }
    //////////// SETTER///////////////////
    public void setName(String name){
        name = nameParam;
    }
    //////////// GETTER///////////////////
    public string getDescription(){
        return descParam;
    }
    //////////// SETTER///////////////////
    public void setName(String name){
        this.name = nameParam;
    }

}