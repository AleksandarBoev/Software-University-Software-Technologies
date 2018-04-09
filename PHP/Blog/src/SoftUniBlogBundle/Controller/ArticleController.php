<?php

namespace SoftUniBlogBundle\Controller;

use SoftUniBlogBundle\Entity\Article;
use SoftUniBlogBundle\Form\ArticleType;
use Symfony\Bundle\FrameworkBundle\Controller\Controller; // original
//use Symfony\Component\BrowserKit\Request; // original
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Route; // added
use Sensio\Bundle\FrameworkExtraBundle\Configuration\Security; //added
use Symfony\Component\HttpFoundation\Request; //added


class ArticleController extends Controller
{
    /**
     * @param Request $request
     *
     * @Route("/article/create", name="article_create")
     * @Security("is_granted('IS_AUTHENTICATED_FULLY')")
     *
     * @return \Symfony\Component\HttpFoundation\RedirectResponse
     */
    public function create(Request $request)
    {
        $article = new Article();
        $form = $this->createForm(ArticleType::class, $article);

        return $this->render('article/create.html.twig',
            array('form' => $form->createView()));
    }
}
