package com.fenice.calculationtest;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fenice.calculationtest.databinding.FragmentLoseBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoseFragment extends Fragment {

    public LoseFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        MyViewModel myViewModel = ViewModelProviders.of(requireActivity(), new SavedStateViewModelFactory(requireActivity().getApplication(), requireActivity())).get(MyViewModel.class);
        FragmentLoseBinding binding;
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_lose, container, false);
        binding.setData(myViewModel);
        binding.setLifecycleOwner(requireActivity());
        binding.button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_loseFragment_to_titleFragment);
            }
        });

        return binding.getRoot();
    }

}
