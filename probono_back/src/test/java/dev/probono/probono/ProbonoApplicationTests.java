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
	public void personSave() {

		List<Long> list = new ArrayList<>();
		List<Long> list1 = new ArrayList<>();

		list.add(1L);
		list.add(2L);
		list.add(3L);

		list1.add(4L);
		list1.add(5L);
		
		Person p1 = new Person("Lim", "emal@aaa", list, list1);
		Person p2 = new Person("Kim", "email@bbb", null, list1);
		Person p3 = new Person("Jang", "email@ccc", list, null);
		Person p4 = new Person("Lee", "email@ddd", null, list1);
		Person p5 = new Person("Oh", "email@eee", list, null);

		pr.save(p1);
		pr.save(p2);
		pr.save(p3);
		pr.save(p4);
		pr.save(p5);
		
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

	@Test
	public void getTalents() {

		List<Talent> list = tr.findAll();
		
		for(Talent t : list) {
			System.out.println(t.getId() + " " + t.getTalentType());
		}
	}

	@Test
	public void getAllBeneficiary() {
		List<Person> list = pr.findByListBenefitIsNotNull();

		for(Person p : list) {
			System.out.println(p.getId() + ", " + p.getName() + ", " + p.getListBenefit());
		}
	}

	

	


}
