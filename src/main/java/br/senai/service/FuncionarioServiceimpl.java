package br.senai.service;


import br.senai.model.Funcionario;
import br.senai.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.PortUnreachableException;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class FuncionarioServiceimpl implements FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;

    @Override
    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }

    @Override
    public Funcionario findbyNome(String nome) {
        return null;
    }

    @Override
    public Funcionario findById(Long id){
        Optional func = funcionarioRepository.findById(id);
        return !func.isEmpty() ? (Funcionario) func.get() : new Funcionario();
    }

    @Override
    public Funcionario save(Funcionario funcionario){
        try {
            return funcionarioRepository.save(funcionario);
        } catch (Exception e){
            throw e;
        }
    }
    @Override
    public void deleteById(Long id){
        try {
           funcionarioRepository.deleteById(id);
        } catch(Exception e){
            throw e;
        }
    }
}
