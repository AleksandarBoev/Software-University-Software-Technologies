<?php

namespace SoftUniBlogBundle\Form;

//use Doctrine\DBAL\Types\TextType; // deleted
use Symfony\Component\Form\Extension\Core\Type\TextType; //added
use Symfony\Component\Form\AbstractType;
use Symfony\Component\Form\FormBuilderInterface;
use Symfony\Component\OptionsResolver\OptionsResolver;

class ArticleType extends AbstractType
{
    public function buildForm(FormBuilderInterface $builder, array $options)
    {
        $builder
            ->add('title', TextType::class)
            ->add('content', TextType::class);
    }

    public function configureOptions(OptionsResolver $resolver)
    {
        $resolver->setDefaults(array(
            'data_class' => 'SoftUniBlogBundle\Entity\Article',
        ));
    }

    public function getName() //was "getBlockPrefix()" before
    {
        return 'soft_uni_blog_bundle_article_type';
    }
}
