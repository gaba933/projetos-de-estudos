import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{

  usuario: String="";
  senha: String="";

  constructor(private router : Router){
  }

  ngOnInit(): void {
    this.usuario = this.router;

  }

  verifica(){
    if (this.usuario=="admin" && this.senha=="123") {
      this.router.navigate(['/home']);
    }else{
      this.router.navigate(['/invalido'])
    }
  }
}
