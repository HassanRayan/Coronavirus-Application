package com.hassan.Controller;

import com.hassan.models.LocationStats;
import com.hassan.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService ;
    @GetMapping ("/")
    public String Home(Model model){
       List<LocationStats> allStats = coronaVirusDataService.getAllStats();
       int TotalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestYotalCases()).sum();
        int TotalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffFromPreviousDay()).sum();
        model.addAttribute("locationState" ,allStats);
        model.addAttribute("TotalReportedCases" ,TotalReportedCases);
        model.addAttribute("TotalNewCases" ,TotalNewCases);
        return "home";
    }


}
