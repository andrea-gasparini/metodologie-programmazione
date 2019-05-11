package it.uniroma1.metodologie2019.hw3;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class WordNetTest {

	private WordNet wn16;
	private WordNet wn171;
	private WordNet wn20;
	private WordNet wn21;
	private WordNet wn30;
	private WordNet wn31;

	@BeforeAll
	public void setup() {
		try {
			wn16 = WordNet.getInstance("1.6");
			wn171 = WordNet.getInstance("1.7.1");
			wn20 = WordNet.getInstance("2.0");
			wn21 = WordNet.getInstance("2.1");
			wn30 = WordNet.getInstance("3.0");
			wn31 = WordNet.getInstance("3.1");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("NO");
		}
	}
	
	@Test
	public void testSingletons() {
		assertTrue(wn16 == WordNet.getInstance("1.6"));
		assertTrue(wn171 == WordNet.getInstance("1.7.1"));
		assertTrue(wn20 == WordNet.getInstance("2.0"));
		assertTrue(wn21 == WordNet.getInstance("2.1"));
		assertTrue(wn30 == WordNet.getInstance("3.0"));
		assertTrue(wn31 == WordNet.getInstance("3.1"));
		assertNull(WordNet.getInstance("4.0"));
		assertNull(WordNet.getInstance("2.0.1"));
		assertEquals(wn16.getVersion(), "1.6");
		assertEquals(wn171.getVersion(), "1.7.1");
		assertEquals(wn20.getVersion(), "2.0");
		assertEquals(wn21.getVersion(), "2.1");
		assertEquals(wn30.getVersion(), "3.0");
		assertEquals(wn31.getVersion(), "3.1");
	}
	
	@Test
	public void testWordNet() {
		assertTrue(wn16 instanceof Iterable<?>);
		//test getSynsets
		List<Synset> synsets = wn20.getSynsets("drink");
		assertEquals(synsets.size(), 10);
		for (Synset synset : synsets) {
			assertTrue(synset.getSynonyms().contains("drink"));
			assertTrue(synset.contains("drink"));
			assertFalse(synset.contains("car"));
		}
		List<Synset> synsetsVerbs = wn20.getSynsets("drink", POS.VERB);
		assertEquals(synsetsVerbs.size(), 5);
		
		for (Synset s : synsetsVerbs)
			assertEquals(s.getPOS(), POS.VERB);
		
		synsets = wn16.getSynsets("ack24nsihj3ls");
		assertTrue(synsets == null || synsets.isEmpty());
		synsets = wn21.getSynsets("cat", POS.ADVERB);
		assertTrue(synsets == null || synsets.isEmpty());
		
		synsets = wn30.getSynsets("house");
		assertEquals(synsets.size(), 14);
		String offsets = synsets.stream().map(Synset::getOffset).sorted().collect(Collectors.joining(" "));
		assertEquals(offsets, "00432164 02459173 02701828 03544360 03545150 04417809 07971449 08059870 08078020 08163025 08222966 08224580 08381296 08685677");
		//test getSynsetFromID
		Synset syn = wn171.getSynsetFromID("01993048n");
		assertNotEquals(syn, null);
		assertTrue(syn.contains("mouse"));
		assertTrue(syn.getExamples() == null || syn.getExamples().isEmpty());
		
		
		syn = wn31.getSynsetFromID("01993048n");
		assertEquals(syn , null);
		//test stream()
		assertEquals(wn16.stream().count(), 99642);
		assertEquals(wn171.stream().count(), 111223);
		assertEquals(wn20.stream().count(), 115424);
		assertEquals(wn21.stream().count(), 117597);
		assertEquals(wn30.stream().count(), 117659);
		assertEquals(wn31.stream().count(), 117791);
		
		//test getRealtedSynsets()
		Synset car = wn30.getSynsetFromID("02958343n");
		Collection<Synset> adjs = wn30.getRelatedSynsets(car, "@");
		assertTrue(adjs.size() == 1);
		Synset hyp = adjs.iterator().next();
		assertEquals(hyp.getID(), "03791235n");
		assertEquals(hyp.getSynonyms().stream().sorted().collect(Collectors.joining(" ")), "automotive_vehicle motor_vehicle");
		Synset person = wn30.getSynsetFromID("00007846n");
		adjs = wn30.getRelatedSynsets(person, "~");
		assertEquals(adjs.size(), 402);
	}
	
	@Test
	public void testSynset() {
		Synset syn = wn31.getSynsetFromID("07624692n");
		assertEquals(syn.getID(), "07624692n");
		assertEquals(syn.getOffset(), "07624692");
		assertEquals(syn.getPOS(), POS.NOUN);
		assertEquals(syn.getGloss(), "hard bright-colored stick candy (typically flavored with peppermint)");
		assertTrue(syn.contains("rock"));
		assertTrue(syn.getSynonyms().contains("rock"));
		syn = wn31.getSynsetFromID("02961779n");
		assertTrue(syn.getExamples().size() == 1);
		assertEquals(syn.getExamples().iterator().next(), "he needs a car to get to work");
		
		assertEquals(syn.getOffset(), "02961779");
		assertEquals(syn.getPOS(), POS.NOUN);
		syn = wn171.getSynsetFromID("00628030v");
		String synonyms = syn.getSynonyms().stream().sorted().collect(Collectors.joining(" "));
		assertEquals(synonyms, "call call_up phone ring telephone");
		
		Synset planeSynset = wn21.getSynsetFromID("06173459n");
		assertEquals(planeSynset.getGloss(), "medium for radio and television broadcasting");
		assertEquals(planeSynset.getExamples().size(), 2);
		assertEquals(planeSynset.getExamples().stream().sorted().collect(Collectors.joining("\t")), 
				"the president used the airwaves to take his message to the people\tthe program was on the air from 9 til midnight");
	}
	
	@Test
	public void testMapper() {
		WordNetMapping mapping = Mapper.map(wn20, wn30);
		Synset s1 = wn20.getSynsetFromID("00002056n");
		Optional<SynsetPairing> c1 = mapping.getMapping(s1);
		assertTrue(c1.isPresent());
		SynsetPairing p1 = c1.get();
		assertEquals(p1.getSource().getID(), s1.getID());
		assertEquals(p1.getTarget().getID(), "00002452n");
		assertEquals(p1.getScore(), 1.0);
		
		Synset s2 = wn20.getSynsetFromID("00001740a");
		Optional<SynsetPairing> c2 = mapping.getMapping(s2);
		assertTrue(c2.isPresent());
		SynsetPairing p2 = c2.get();	
		assertEquals(p2.getSource().getID(), s2.getID());
		assertEquals(p2.getTarget().getID(), s2.getID());
		assertEquals(p2.getScore(), 1.0);
		
		
		WordNetMapping mapping31 = Mapper.map(wn31, wn16);
		Synset s4 = wn31.getSynsetFromID("06321115n");
		Optional<SynsetPairing> c4 = mapping31.getMapping(s4);
		assertTrue(!c4.isPresent());
		
		WordNetMapping mapping13 = Mapper.map(wn16, wn31);
		List<Synset> subjects16 = wn16.getSynsets("subject", POS.NOUN);
		long exactMapping = subjects16.stream().map(mapping13::getMapping).filter(Optional::isPresent).filter(s -> s.get().getScore() == 1.0).count();
		assertEquals(exactMapping, 5L);
		
		
		WordNetMapping selfMapping= Mapper.map(wn30, wn30);
		//Tutti i synset dovrebbero avere il mapping con il proprio synset.
		assertTrue(wn30.stream().map(selfMapping::getMapping).filter(s -> !s.isPresent()).count() == 0L);
		

	}
	

}