package org.example.borrowing.controller;

import org.example.borrowing.entity.Borrowing;
import org.example.borrowing.service.BorrowingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrowings")
public class BorrowingController {
    @Autowired
    private BorrowingService borrowingService;

    @GetMapping
    public List<Borrowing> getAllBorrowings() {
        return borrowingService.getAllBorrowings();
    }

    @GetMapping("/{id}")
    public Borrowing getBorrowingById(@PathVariable Long id) {
        return borrowingService.findById(id);
    }

    @PostMapping
    public Borrowing saveBorrowing(@RequestBody Borrowing borrowing) {
        return borrowingService.save(borrowing);
    }

    @DeleteMapping("/{id}")
    public void deleteBorrowingById(@PathVariable Long id) {
        borrowingService.deleteById(id);
    }
}
