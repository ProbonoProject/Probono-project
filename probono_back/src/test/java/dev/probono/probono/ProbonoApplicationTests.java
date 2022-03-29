package dev.probono.probono;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import dev.probono.probono.model.Person;
import dev.probono.probono.model.Talent;
import dev.probono.probono.repository.PersonRepository;
import dev.probono.probono.repository.TalentRepository;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
class ProbonoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	PersonRepository pr;

	@Test
	public void testSave() {
		Talent t1 = new Talent();
		Talent t2 = new Talent();
		Talent t3 = new Talent();
		Talent t4 = new Talent();
		Talent t5 = new Talent();
        
		List<Talent> list = new ArrayList<>();
		List<Talent> list1 = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);

		list1.add(t4);
		list1.add(t5);
		
        // Person p = new Person(list);

		Person p = new Person("Lim", "emial@ddd", list, list1);

		pr.save(p);
		
    }

	@Autowired
	TalentRepository tr;
	@Test
	public void talentSave() {

		Talent t1 = new Talent("talent_1");
		tr.save(t1);

		Talent t2 = new Talent("talent_2");
		tr.save(t2);

		Talent t3 = new Talent("talent_3");
		tr.save(t3);
	}

}
