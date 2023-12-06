package com.example.springapi.service;

import com.example.springapi.api.model.Scholarship;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ScholarshipService {


    private final MySQL mysql;

    public ScholarshipService(){
        String hostname = "vum.h.filess.io";
        String database = "CloudProject_entireloud";
        String port = "3307";
        String username = "CloudProject_entireloud";
        String password = "b83d7d1d1a974c5b70bcf0847ee8abfb7bf0f692";

        mysql  = new MySQL(hostname, database, port, username, password);

    }
    public List<Scholarship> getAllScholarships() throws SQLException, ClassNotFoundException {
        List<Scholarship> scholarships = new ArrayList<>();
        ResultSet resultSet;
        try (var conn = mysql.connect()) {
            resultSet = conn.createStatement().executeQuery("SELECT * FROM Scholarships");
            while (resultSet.next()) {
                Scholarship scholarship = new Scholarship();
                scholarship.setId(resultSet.getInt("ID"));
                scholarship.setName(resultSet.getString("Name"));
                scholarship.setScholarshipProvider(resultSet.getString("ScholarshipProvider"));
                scholarship.setState(resultSet.getString("State"));
                scholarship.setAmount(resultSet.getInt("Amount"));
                scholarship.setApplicationDeadline(resultSet.getDate("ApplicationDeadline"));
                scholarship.setDescription(resultSet.getString("Description"));
                scholarship.setScholarshipDuration(resultSet.getString("ScholarshipDuration"));
                scholarship.setNeedsEssay(resultSet.getInt("NeedsEssay"));

                scholarships.add(scholarship);
            }
        }
        return scholarships;
    }

    public Scholarship getScholarship(Integer id) {
        return null;
    }
}
