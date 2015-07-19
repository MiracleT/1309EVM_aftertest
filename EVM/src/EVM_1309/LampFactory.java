package EVM_1309;

public class LampFactory {
Lamps l;

Lamps getType(String type){
	if(type=="readyLamp")
		l=new ReadyLamp();
	else if(type=="CandidateLamp")
		l=new CandidateLamp();
	else if(type=="OnLamp")
		l=new OnLamp();
	else if(type=="BusyLamp")
		l=new BusyLamp();
return l;
}

}
