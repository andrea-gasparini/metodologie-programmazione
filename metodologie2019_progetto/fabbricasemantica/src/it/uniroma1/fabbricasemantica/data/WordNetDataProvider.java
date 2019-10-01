package it.uniroma1.fabbricasemantica.data;
//TODO Javadoc everywhere
public class WordNetDataProvider implements DataProvider<String>
{	//TODO implementare dati dinamici da WordNet
	@Override 
	public String getData(Task task)
	{
		if (task == StandardTask.TRANSLATION_ANNOTATION)
		{
			return "{" +
					"\"word\": \"Apple\"," +
					"\"definition\": \"It's one of the most common fruits you mention in examples but that you rarely eat\"" +
					"}";
		}
		else if (task == StandardTask.WORD_ANNOTATION)
		{
			return "{\"definition\": \"A motor vehicle with four wheels; usually propelled by an internal combustion engine\"}";
		}
		else if (task == StandardTask.DEFINITION_ANNOTATION)
		{
			return "{" + 
					"\"word\": \"car\"," +
					"\"hypernym\": \"motor_veichle\"" +
					"}";
		}
		else if (task == StandardTask.SENSE_ANNOTATION)
		{
			return "{" + 
					"\"word\":\"mouse\"," +
					"\"sentence\":\"A swollen bruise caused by a blow to the eye\"," + 
					"\"senses\": [\"02330245n\", \"03793489n\", \"10335563n\", \"14289387n\"]" + 
					"}";
		}
		else if (task == StandardTask.TRANSLATION_VALIDATION)
		{
			return "{" +
					"\"word\": \"rock\"," +
					"\"definition\": \"A lump or mass of hard consolidated mineral matter\"," + 
					"\"translations\": [\"Un grumo o una massa di materia minerale consolidata dura\"," +
										"\"Materiale costituito dall'aggregato di minerali come quelli che formano la crosta terrestre\"," +
										"\"Un'associazione non ufficiale di persone o gruppi\"]" +
					"}";
		}
		else if (task == StandardTask.SENSE_VALIDATION)
		{
			return "{" +
					"\"word\": \"bank\"," +
					"\"sentence\": \"He cashed a check at the bank\"," +
					"\"definition\": \"09213565n\"" +
					"}";
		}
		else if (task == StandardTask.MY_ANNOTATION)
		{
			return "{" +
					"\"word\": \"chief\"," +
					"\"synonym\": \"boss\"" +
					"}";
		}
		return null; 
	}
	

}
