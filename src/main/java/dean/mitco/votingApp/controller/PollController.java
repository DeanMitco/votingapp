package dean.mitco.votingApp.controller;

import dean.mitco.votingApp.model.Poll;
import dean.mitco.votingApp.service.PollService;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/polls")
@NoArgsConstructor
@RequiredArgsConstructor
public class PollController {

    @NonNull
    private PollService pollService;

    @PostMapping
    public Poll addPoll(@RequestBody Poll poll) {
        return pollService.createPoll(poll);
    }

}
