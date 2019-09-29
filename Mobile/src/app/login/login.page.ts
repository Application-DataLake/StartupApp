import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { RegistrationPage } from '../registration/registration.page';
import { MenuController, NavController, ModalController } from '@ionic/angular';

@Component({
  selector: 'app-login',
  templateUrl: 'login.page.html',
  styleUrls: ['login.page.scss'],
})
export class LoginPage implements OnInit {

  constructor(private modalController: ModalController,
    private menu: MenuController,
    private navCtrl: NavController) {

  }

  ngOnInit() {

  }

  // Dismiss Login Modal
  dismissLogin() {
    this.modalController.dismiss();
  }

  // On Registration button tap, dismiss Login modal and open Registration Modal
  async registration() {
    this.dismissLogin();
    const registartionModal = await this.modalController.create({
      component: RegistrationPage
    });
    return await registartionModal.present();
  }

  loginSubmit(form) {

  }

}
