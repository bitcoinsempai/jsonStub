package com.jsonStub.Controller;
import com.jsonStub.Model.DataGenerator;
import com.jsonStub.Model.RequestDTO;
import com.jsonStub.Model.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/test")
public class MainController {
    @PostMapping("/test")
    public ResponseEntity<ResponseDTO> generateData(@RequestBody RequestDTO request) {
        // Генерируем ответ с указанным колиеством элементов
        ResponseDTO response = DataGenerator.generateRandomResponse(request.getCount());
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
