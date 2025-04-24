# subliime javac build 

https://www.oracle.com/java/technologies/downloads/

----------------------------------------------


 
 NAMWE: MinJavaC.sublime-build
 {
    "cmd": ["javac", "-Xlint:none", "-cp", ".;..", "-encoding", "utf8", "$file_name"],   
    "path": "C:\\Program Files\\Java\\jdk-17\\bin",
    //
    //*****************************************************************************
    // NB! Sjekk at mappenavn (etter "path") stemmer med plasseringen på din maskin
    //*****************************************************************************
    //
    "selector": "source.java",   
    "file_regex": "^(...*?):([0-9]*):?([0-9]*)",
    "encoding": "cp1252", 
    "variants":
    [ 
      {                
        "name": "Run",
        "cmd": ["java", "-cp", ".;..", "$file_base_name"]  
      }
    ]
  }



----------------------------------------


#keybind change 


      [
        { "keys": ["ctrl+shift+b"], "command": "build", "args": {"variant": "Run"} }       
      ]



-------------------------------------------------


#code for test if succes import


    import static java.lang.System.*;  

    public class Livstegn {
      public static void main(String [] args) {   
        out.println("Hei verden!");    
      } 
    }


-----------------------------------------------------------------




    
      
  
