package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.entity.CabDriver;
import com.example.demo.service.CabDriverService;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import static org.mockito.BDDMockito.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
@AutoConfigureMockMvc
public class CabDriverTest {

	
	@Autowired
    MockMvc mock;

    @Autowired
    ObjectMapper mapper;
    
    @MockBean
    CabDriverService service;
  
    private CabDriver gowri;
    private CabDriver viji;
    private CabDriver pavi;
    
    @BeforeAll
    void init() {
    	
    	gowri=new CabDriver(1000, "gowri", 78654, "Chennai", LocalDate.of(2000, 7, 29), 3.8);
   	 	viji=new CabDriver(1001, "viji", 78654, "Kerala", LocalDate.of(2000, 8,17), 4.8);
   	 	pavi=new CabDriver(1002, "Pavi", 78654, "Trichy", LocalDate.of(2000, 9, 9), 2.8);

    }

	@DisplayName("Test find All method return a array") 
	@Test
	void testFindAll() throws Exception {
    	 
		List<CabDriver> list=new ArrayList<>();
		
		list.add(gowri);
		list.add(viji);
		list.add(pavi);
		
		given(service.findAll()).willReturn(list);
		
		mock.perform(MockMvcRequestBuilders
				.get("/api/v1/drivers")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", hasSize(3)))
				.andExpect(jsonPath("$[2].driverName", is("Pavi")));
	}

	@DisplayName("Test add method return status code 201 and returns the element added")
	@Test
	void testAdd() throws Exception{
		
		CabDriver viji=new CabDriver(1004, "viji", 87678,
				"Delhi", LocalDate.of(1998, 06, 15),4.6);
		
		given(service.save(viji)).willReturn(viji);
		
		mock.perform(MockMvcRequestBuilders.post("/api/v1/drivers").
				contentType(MediaType.APPLICATION_JSON).
				content(asJsonString(viji)))
				.andExpect(status().isCreated())
				.andExpect(content()
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.driverName", is("viji")));
	}
	@Test
	@DisplayName("Test findBy Id method returns the element")
	void testFindById() throws Exception {
		
		Optional<CabDriver> element=Optional.of(gowri);

		given(service.findById(1000)).willReturn(element);
		
		mock.perform(MockMvcRequestBuilders
                .get("/api/v1/drivers/1000"))
                .andExpect(jsonPath("$.driverName",is("gowri")));
	}
	@Test
	@DisplayName("Test deleteBy Id method ")
	void testDeleteById() throws Exception {
		
		Optional<CabDriver> element=Optional.of(viji);

		given(service.deleteById(1004)).willReturn(element);
		
		mock.perform(MockMvcRequestBuilders
                .delete("/api/v1/drivers/1004"))
                .andExpect(jsonPath("$.driverName",is("viji")));
		
	}
	private static String asJsonString(CabDriver obj) {
			
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			
			return objectMapper.writeValueAsString(obj);
			
		} catch (Exception e) {
			
			throw new RuntimeException(e);	
		}
	}
}
	
	
	
	
