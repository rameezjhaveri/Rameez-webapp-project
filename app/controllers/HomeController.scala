package controllers

import javax.inject._
import play.api.mvc._

class HomeController @Inject()(
                                val controllerComponents: ControllerComponents
                              ) extends BaseController {

  def onPageLoad(): Action[AnyContent] = {
    ???
  }

  def onPageSubmit(): Action[AnyContent] ={
    ???
  }

  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
}
