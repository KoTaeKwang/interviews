package CompositePattern;
//컨테이너와 내용물 동일시 
//기본 클래스와 이를 포함하는 컨테이너 클래스를재귀적인 형태로 표현, 객체들의 집합을 다룰 때 유용 ,  ex) 폴더안의 파일

public class main {
	public static void main(String[] args) {
		Folder 
		root = new Folder("root"),
		home= new Folder("home"),
		garam= new Folder("garam"),
		music = new Folder("music"),
		picture= new Folder("picture"),
		doc= new Folder("doc"),
		usr= new Folder("usr");
		
		File
		track1 = new File("track1"),
		track2= new File("track2"),
		pic1= new File("pic1"),
		doc1= new File("doc1"),
		java= new File("java");
		
		root.addComponent(home);
		 home.addComponent(garam);
		  garam.addComponent(music);
		    music.addComponent(track1);
		    music.addComponent(track2);
		  garam.addComponent(picture);
		    picture.addComponent(pic1);
		  garam.addComponent(doc);
		    doc.addComponent(doc1);
		    
	    root.addComponent(usr);
	      usr.addComponent(java);
		show(root);
		
	}
	
	private static void show(Component component){
		System.out.println(component.getClass().getName()+"|"+component.getName());
		if(component instanceof Folder){
			for(Component c :((Folder)component).getChildren()){
				show(c);
			}
		}
	}
}
