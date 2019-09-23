class ProjectTest{
    public static void main (String[] args){
        Project project1 = new Project("Bridge", "Total cost: $50 billion");
        Project project2 = new Project("Movie", "Total cost: $40 billion");
        Project project3 = new Project();
        Project project4 = new Project("Airport");
        project1.elevatorPitch(project2);
        project2.elevatorPitch(project1);
        project3.elevatorPitch(project1);
        project4.elevatorPitch(project2);
    }
}